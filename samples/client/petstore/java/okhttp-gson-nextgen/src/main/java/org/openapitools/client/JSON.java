/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(org.openapitools.client.model.Animal.class, new TypeSelector<org.openapitools.client.model.Animal>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Animal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Cat", org.openapitools.client.model.Cat.class);
                        classByDiscriminatorValue.put("Dog", org.openapitools.client.model.Dog.class);
                        classByDiscriminatorValue.put("Animal", org.openapitools.client.model.Animal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Cat.class, new TypeSelector<org.openapitools.client.model.Cat>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Cat> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Cat", org.openapitools.client.model.Cat.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Dog.class, new TypeSelector<org.openapitools.client.model.Dog>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Dog> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Dog", org.openapitools.client.model.Dog.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.GrandparentAnimal.class, new TypeSelector<org.openapitools.client.model.GrandparentAnimal>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.GrandparentAnimal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ParentPet", org.openapitools.client.model.ParentPet.class);
                        classByDiscriminatorValue.put("GrandparentAnimal", org.openapitools.client.model.GrandparentAnimal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "pet_type"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Mammal.class, new TypeSelector<org.openapitools.client.model.Mammal>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Mammal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Pig", org.openapitools.client.model.Pig.class);
                        classByDiscriminatorValue.put("whale", org.openapitools.client.model.Whale.class);
                        classByDiscriminatorValue.put("zebra", org.openapitools.client.model.Zebra.class);
                        classByDiscriminatorValue.put("mammal", org.openapitools.client.model.Mammal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.NullableShape.class, new TypeSelector<org.openapitools.client.model.NullableShape>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.NullableShape> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Quadrilateral", org.openapitools.client.model.Quadrilateral.class);
                        classByDiscriminatorValue.put("Triangle", org.openapitools.client.model.Triangle.class);
                        classByDiscriminatorValue.put("NullableShape", org.openapitools.client.model.NullableShape.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "shapeType"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.ParentPet.class, new TypeSelector<org.openapitools.client.model.ParentPet>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.ParentPet> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ParentPet", org.openapitools.client.model.ParentPet.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "pet_type"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Pig.class, new TypeSelector<org.openapitools.client.model.Pig>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Pig> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("BasquePig", org.openapitools.client.model.BasquePig.class);
                        classByDiscriminatorValue.put("DanishPig", org.openapitools.client.model.DanishPig.class);
                        classByDiscriminatorValue.put("Pig", org.openapitools.client.model.Pig.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Quadrilateral.class, new TypeSelector<org.openapitools.client.model.Quadrilateral>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Quadrilateral> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ComplexQuadrilateral", org.openapitools.client.model.ComplexQuadrilateral.class);
                        classByDiscriminatorValue.put("SimpleQuadrilateral", org.openapitools.client.model.SimpleQuadrilateral.class);
                        classByDiscriminatorValue.put("Quadrilateral", org.openapitools.client.model.Quadrilateral.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "quadrilateralType"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Shape.class, new TypeSelector<org.openapitools.client.model.Shape>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Shape> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Quadrilateral", org.openapitools.client.model.Quadrilateral.class);
                        classByDiscriminatorValue.put("Triangle", org.openapitools.client.model.Triangle.class);
                        classByDiscriminatorValue.put("Shape", org.openapitools.client.model.Shape.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "shapeType"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.ShapeOrNull.class, new TypeSelector<org.openapitools.client.model.ShapeOrNull>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.ShapeOrNull> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Quadrilateral", org.openapitools.client.model.Quadrilateral.class);
                        classByDiscriminatorValue.put("Triangle", org.openapitools.client.model.Triangle.class);
                        classByDiscriminatorValue.put("ShapeOrNull", org.openapitools.client.model.ShapeOrNull.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "shapeType"));
                    }
          })
                .registerTypeSelector(org.openapitools.client.model.Triangle.class, new TypeSelector<org.openapitools.client.model.Triangle>() {
                    @Override
                    public Class<? extends org.openapitools.client.model.Triangle> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquilateralTriangle", org.openapitools.client.model.EquilateralTriangle.class);
                        classByDiscriminatorValue.put("IsoscelesTriangle", org.openapitools.client.model.IsoscelesTriangle.class);
                        classByDiscriminatorValue.put("ScaleneTriangle", org.openapitools.client.model.ScaleneTriangle.class);
                        classByDiscriminatorValue.put("Triangle", org.openapitools.client.model.Triangle.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "triangleType"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(new org.openapitools.client.model.AdditionalPropertiesClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Animal.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Apple.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.AppleReq.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ArrayOfArrayOfNumberOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ArrayOfNumberOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ArrayTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Banana.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.BananaReq.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.BasquePig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Capitalization.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Cat.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.CatAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Category.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ClassModel.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Client.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ComplexQuadrilateral.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.DanishPig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.DeprecatedObject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Dog.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.DogAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Drawing.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.EnumArrays.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.EnumTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.EquilateralTriangle.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.FileSchemaTestClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Foo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.FormatTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Fruit.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.FruitReq.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.GmFruit.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.GrandparentAnimal.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.HasOnlyReadOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.HealthCheckResult.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.InlineResponseDefault.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.IsoscelesTriangle.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Mammal.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.MapTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.MixedPropertiesAndAdditionalPropertiesClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Model200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ModelApiResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ModelReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Name.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.NullableClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.NullableShape.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.NumberOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ObjectWithDeprecatedFields.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Order.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.OuterComposite.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ParentPet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Pet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Pig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Quadrilateral.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.QuadrilateralInterface.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ReadOnlyFirst.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ScaleneTriangle.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Shape.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ShapeInterface.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.ShapeOrNull.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.SimpleQuadrilateral.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.SpecialModelName.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Tag.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Triangle.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.TriangleInterface.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.User.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Whale.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new org.openapitools.client.model.Zebra.CustomTypeAdapterFactory())
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
