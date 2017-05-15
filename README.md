# JsonldAndroid

This is a Java/Android implementation of the JSON-LD specification and the JSON-LD-API specification. The main structure of the project has been taken from https://github.com/jsonld-java/jsonld-java. This project has been altered to support android devices and also now includes the URDNA2015 algorithm for normalization. 


# Include the project into your application

In Android Studio 

Click ``` File → New → Import Module``` and select the jsonldAndroid module.

The step above will add ```':jsonldAndroid'```  to the settings.gradle file as shown below.

```gradle
include ':app', ':wstompclient'
```
To compile the library in your application simply add this line to the project's build.gradle file.

```gradle
dependencies {
	...
compile project(':jsonldAndroid')
	...
}
```

# Example code


```
Object document = JsonUtils.fromString(jsonObject.toString());

new JsonNormalizer(document, new JsonNormalizer.OnNormalizedCompleted() {
   @Override
   public void OnNormalizedComplete(Object object) {
       String normalized = (String) object;
   }
}).execute();

```
