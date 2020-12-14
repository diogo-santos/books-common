# books-common
Common util library for books API

## Getting the code on your computer
- [ ] Java 8
- [ ] Maven 3+
- [ ] Import the project from GitHub https://github.com/diogo-santos/books-common

Install the jar
```
cd books-common
mvn clean install
```

Execute tests
```
mvn test
```

## Import the library in your project
Add the dependency in your pom.xml
```
<dependency>
    <groupId>com.book.utils</groupId>
    <artifactId>books-common</artifactId>
    <version>0.0.1</version>
</dependency>
```

Or if you prefer without install the package locally you can get it from jitpack:

```
    <dependencies>
		<dependency>
			<groupId>com.github.diogo-santos</groupId>
			<artifactId>books-common</artifactId>
			<version>0.0.1</version>
		</dependency>
    </dependencies>

	<repositories>
		<repository>
			<id>jitpack.io</id>
			<url>https://jitpack.io</url>
		</repository>
	</repositories>
```

