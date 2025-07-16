package org.wso2.rule.validator.validator.utils;

import org.wso2.rule.validator.validator.Placeholder;

public class MessageUtils {

    public static String replacePlaceholders(String template, Placeholder placeholders) {
        return template
                .replace("{{description}}",placeholders.getDescription())
                .replace("{{error}}",placeholders.getError())
                .replace("{{property}}",placeholders.getProperty())
                .replace("{{path}}",placeholders.getPath())
                .replace("{{value}}",placeholders.getValue());

    }
}

