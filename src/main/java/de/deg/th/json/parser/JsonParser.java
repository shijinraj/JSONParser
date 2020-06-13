package de.deg.th.json.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;

import de.deg.th.json.parser.model.Project;

/**
 * Json Parser class
 * @author shijin.raj
 *
 */
public class JsonParser {

	private static final String PACKAGE_NAME = "de.deg.th.json.parser.model";
	private static final String SOURCE_LOCATION = "/src/main/java/";
	private static final String JSON_FILE_NAME = "input.json";
	private static final String OBJECT_CONTAINER_NAME = "Project";

	/**
	 * This method generate object model into the package
	 * "de.deg.th.json.parser.model" from a input.json
	 * 
	 * 
	 * @param jsonFileURL - input JSON URL
	 * @throws URISyntaxException
	 */
	public void generateObjectModel(URL jsonFileURL) throws URISyntaxException {
		File inputJson = Paths.get(jsonFileURL.toURI()).toFile();
		File outputPojoDirectory = new File("." + File.separator + SOURCE_LOCATION);
		outputPojoDirectory.mkdirs();
		try {
			convertToJSON(inputJson.toURI().toURL(), outputPojoDirectory, PACKAGE_NAME, OBJECT_CONTAINER_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method reads input.json file from resource folder and converts into a
	 * JSON String
	 * 
	 * @return JSON String
	 */
	public String readJsonFile() {
		String output = null;
		ObjectMapper mapper = new ObjectMapper();
		try (InputStream is = JsonParser.class.getResourceAsStream("/" + JSON_FILE_NAME)) {
			output = mapper.writeValueAsString(mapper.readValue(is, Project.class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * This method reads input.json file from resource folder and converts into the
	 * Project.java class
	 * 
	 * @return Project class
	 */
	public Project getJsonData() {
		Project project = null;
		ObjectMapper mapper = new ObjectMapper();
		try (InputStream is = JsonParser.class.getResourceAsStream("/" + JSON_FILE_NAME)) {
			project = mapper.readValue(is, Project.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return project;
	}

	/**
	 * @param inputJson
	 * @param outputPojoDirectory
	 * @param packageName
	 * @param className
	 * @throws IOException
	 */
	private void convertToJSON(URL inputJson, File outputPojoDirectory, String packageName, String className)
			throws IOException {
		JCodeModel codeModel = new JCodeModel();
		URL source = inputJson;
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}

			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};
		SchemaMapper mapper = new SchemaMapper(
				new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, className, packageName, source);
		codeModel.build(outputPojoDirectory);
	}

}
