package org.wso2.rule.validator.validator;

public class Placeholder {
    private String description;
    private String error;
    private String property;
    private String path;
    private String value;

    public Placeholder(String description, String error, String property, String path, String value) {
        this.description = description;
        this.error = error;
        this.property = property;
        this.path = path;
        this.value = value;

    }

    public String getDescription() {
        return description;
    }

    public String getError() {
        return error;
    }

    public String getProperty() {
        return property;
    }

    public String getPath() {
        return path;
    }

    public String getValue() {
        return value;
    }

}
