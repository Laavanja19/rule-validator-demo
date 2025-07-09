package org.wso2.rule.validator.validator.utils;

import java.util.Map;

public class MessageUtils {

    public static String replacePlaceholders(String template, Map<String, String> values) {
        if (template == null || template.isEmpty()) {
            return "";
        }

        String message = template;
        for (Map.Entry<String, String> entry : values.entrySet()) {
            String placeholder = "{{" + entry.getKey() + "}}";
            message = message.replace(placeholder, entry.getValue() != null ? entry.getValue() : "");
        }

        return message;
    }
}

