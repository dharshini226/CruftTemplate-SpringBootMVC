package com.{{cookiecutter.developer_initials}};

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.{{cookiecutter.developer_initials}}.entity.{{cookiecutter.entity_name}};
import com.{{cookiecutter.developer_initials}}.service.{{cookiecutter.entity_name}}Service;

@SpringBootTest
public class {{cookiecutter.entity_name}}SpringBootCRUDProjTest {

	@Autowired
	private {{cookiecutter.entity_name}}Service service;
	
	String randomString = UUID.randomUUID().toString();
	Random random = new Random();
	Double randomDouble = random.nextDouble();
	Float randomFloat=random.nextFloat();
	Integer randomInteger = random.nextInt();

	@Test
	void save{{cookiecutter.entity_name}}_validInput_returnsIdGreaterThanZero() {
		// Arrange
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}} = new {{cookiecutter.entity_name}}();
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute1}}(random{{cookiecutter.data_type_attribute1}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute2}}(random{{cookiecutter.data_type_attribute2}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute3}}(random{{cookiecutter.data_type_attribute3}});

		// Act
		Integer id = service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}});

		// Assert
		assertTrue(id > 0);
	}

	@Test
	void saveStudent_invalidInput_returnsZero() {
		// Arrange
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}} = new {{cookiecutter.entity_name}}();

		// Act
		Integer id = service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}});

		// Assert
		assertEquals(0, id);
	}

	@Test
	void save{{cookiecutter.entity_name}}_nullInput_throwsException() {
		// Arrange

		// Act & Assert
		assertThrows(NullPointerException.class, () -> service.save{{cookiecutter.entity_name}}(null));
	}

	@Test
	void update{{cookiecutter.entity_name}}_validInput_returnsNonNullStudent() {
		// Arrange
		{{cookiecutter.entity_name}} sobjectOf{{cookiecutter.entity_name}} = new Student();
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute1}}(random{{cookiecutter.data_type_attribute1}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute2}}(random{{cookiecutter.data_type_attribute2}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute3}}(random{{cookiecutter.data_type_attribute3}});

		// Act
		{{cookiecutter.entity_name}} updated{{cookiecutter.entity_name}} = service.update{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}});

		// Assert
		assertNotNull(updated{{cookiecutter.entity_name}});
	}

	@Test
	void update{{cookiecutter.entity_name}}_invalidInput_returnsNull() {
		// Arrange
		{{cookiecutter.entity_name}} student = new {{cookiecutter.entity_name}}();

		// Act
		{{cookiecutter.entity_name}} updated{{cookiecutter.entity_name}} = service.update{{cookiecutter.entity_name}}(student);

		// Assert
		assertNull(updated{{cookiecutter.entity_name}});
	}

	@Test
	void update{{cookiecutter.entity_name}}_nullInput_throwsException() {
		// Act & Assert
		assertThrows(NullPointerException.class, () -> service.update{{cookiecutter.entity_name}}(null));
	}

	@Test
	void delete{{cookiecutter.entity_name}}_existing{{cookiecutter.entity_name}}Id_deletes{{cookiecutter.entity_name}}() {
		// Arrange
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}} = new {{cookiecutter.entity_name}}();
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute1}}(random{{cookiecutter.data_type_attribute1}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute2}}(random{{cookiecutter.data_type_attribute2}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute3}}(random{{cookiecutter.data_type_attribute3}});
		Integer id = service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}});

		// Act & Assert
		assertEquals("Deleted", service.delete{{cookiecutter.entity_name}}(id));
	}

	@Test
	void delete{{cookiecutter.entity_name}}_nonExisting{{cookiecutter.entity_name}}Id_throwsException() {
		// Arrange
		int nonExistingId = 1000;

		// Act & Assert
		assertEquals("Not found", service.delete{{cookiecutter.entity_name}}(nonExistingId));
	}

	@Test
	void getOne{{cookiecutter.entity_name}}_existing{{cookiecutter.entity_name}}Id_returnsNonNull{{cookiecutter.entity_name}}() {
		// Arrange
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}} = new {{cookiecutter.entity_name}}();
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute1}}(random{{cookiecutter.data_type_attribute1}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute2}}(random{{cookiecutter.data_type_attribute2}});
		objectOf{{cookiecutter.entity_name}}.set{{cookiecutter.attribute3}}(random{{cookiecutter.data_type_attribute3}});
		Integer id = service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}});

		// Act
		{{cookiecutter.entity_name}} retrieved{{cookiecutter.entity_name}} = service.getOne{{cookiecutter.entity_name}}(id);

		// Assert
		assertNotNull(retrieved{{cookiecutter.entity_name}});
	}

	@Test
	void getOne{{cookiecutter.entity_name}}_nonExisting{{cookiecutter.entity_name}}Id_returnsNull() {
		// Arrange
		int nonExistingId = 1000;

		// Act
		{{cookiecutter.entity_name}} retrieved{{cookiecutter.entity_name}} = service.getOne{{cookiecutter.entity_name}}(nonExistingId);

		// Assert
		assertNull(retrieved{{cookiecutter.entity_name}});
	}

	@Test
	void getAll{{cookiecutter.entity_name}}_returnsListOfSizeGreaterThanZero() {
		// Arrange
		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}1 = new {{cookiecutter.entity_name}}();
		objectOf{{cookiecutter.entity_name}}1.set{{cookiecutter.attribute1}}(random{{cookiecutter.data_type_attribute1}});
		objectOf{{cookiecutter.entity_name}}1.set{{cookiecutter.attribute2}}(random{{cookiecutter.data_type_attribute2}});
		objectOf{{cookiecutter.entity_name}}1.set{{cookiecutter.attribute3}}(random{{cookiecutter.data_type_attribute3}});
		service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}}1);

		{{cookiecutter.entity_name}} objectOf{{cookiecutter.entity_name}}2 = new {{cookiecutter.entity_name}}();
		objectOf{{cookiecutter.entity_name}}2.set{{cookiecutter.attribute1}}(random{{cookiecutter.data_type_attribute1}});
		objectOf{{cookiecutter.entity_name}}2.set{{cookiecutter.attribute2}}(random{{cookiecutter.data_type_attribute2}});
		objectOf{{cookiecutter.entity_name}}2.set{{cookiecutter.attribute3}}(random{{cookiecutter.data_type_attribute3}});
		service.save{{cookiecutter.entity_name}}(objectOf{{cookiecutter.entity_name}}2);

		// Act
		List<{{cookiecutter.entity_name}}> listOfObjects= service.getAll{{cookiecutter.entity_name}}();
		assertNotNull(listOfObjects);
	}
}