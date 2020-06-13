package de.deg.th.json.parser;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import de.deg.th.json.parser.model.IssueType;
import de.deg.th.json.parser.model.Project;

/**
 * Json parser test class
 * 
 * @author shijin.raj
 *
 */
@TestMethodOrder(OrderAnnotation.class)
class JsonParserTests {

	/**
	 * Task 1 - This method generate object model into the package
	 * "de.deg.th.json.parser.model" from input.json
	 * 
	 * @throws URISyntaxException
	 * 
	 */
	@DisplayName("Task 1 - This method generate object model into the package \"de.deg.th.json.parser.model\" from input.json")
	@Test
	@Order(1)
	void testGenerateObjectModel() throws URISyntaxException {
		System.out.println(
				"####################### Task 1 - Parse a given JSON input string input.json to a object model and print this object model to a file - files will be generated into the package : de.deg.th.json.parser.model . ####################################");
		URL jsonFileURL = JsonParser.class.getClassLoader().getResource("input.json");
		JsonParser jsonparser = new JsonParser();
		jsonparser.generateObjectModel(jsonFileURL);

		System.out.println();

	}

	/**
	 * Task 2 - This method reads input.json file from resource folder and converts
	 * into a JSON String
	 */
	@DisplayName("Task 2 - This method reads input.json file from resource folder and converts into a JSON String")
	@Test
	@Order(2)
	void testReadJsonFile() {
		System.out.println(
				"####################### Task 2 - Parse the given input.json file to an object model ####################################");
		JsonParser jsonparser = new JsonParser();
		String objectModel = jsonparser.readJsonFile();
		assertNotNull(objectModel);

		System.out.println(objectModel);

		System.out.println();

	}

	/**
	 * Task 3 - Defining the output into console
	 */
	@DisplayName("Task 3 - Defining the output into console")
	@Test
	@Order(3)
	void testGetJsonData() {
		System.out.println(
				"####################### Task 3 - Defining the output into console ####################################");
		JsonParser jsonparser = new JsonParser();
		Project project = jsonparser.getJsonData();
		assertNotNull(project);
		System.out.println();

		System.out.println("The name of the container project is \"" + project.getName() + "\"");
		System.out.println();

		System.out.println(
				"The name of the container project category is \"" + project.getProjectCategory().getName() + "\"");
		System.out.println();

		System.out.println("The names of the issueTypes are : ");
		project.getIssueTypes().stream().map(IssueType::getName).forEach(name -> System.out.println("\"" + name + "\""));
		System.out.println();

		System.out.println("The names of the issueTypes where subtask is true are  ");
		project.getIssueTypes().stream().filter(IssueType::getSubtask).map(IssueType::getName)
				.forEach(name -> System.out.println("\"" + name + "\""));
		System.out.println();

		System.out.println();

	}

}
