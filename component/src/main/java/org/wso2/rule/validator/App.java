package org.wso2.rule.validator;

import org.wso2.rule.validator.validator.Validator;
import org.wso2.rule.validator.InvalidContentTypeException;
import org.wso2.rule.validator.InvalidRulesetException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try {

            String rulesetContent = Files.readString(Paths.get("/home/laavanja/Documents/validator-demo/guidelines.yaml"));
            String apiContent = Files.readString(Paths.get("/home/laavanja/Documents/validator-demo/api.yaml"));


            String rulesetValidationResult = Validator.validateRuleset(rulesetContent);
            System.out.println("Ruleset Validation Result:\n" + rulesetValidationResult);


            String documentValidationResult = Validator.validateDocument(apiContent, rulesetContent);
            System.out.println("\nDocument Validation Result:\n" + documentValidationResult);

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        } catch (InvalidRulesetException e) {
            System.err.println("Invalid ruleset:\n" + e.getMessage());
        } catch (InvalidContentTypeException e) {
            System.err.println("Invalid content:\n" + e.getMessage());
        }
    }
}

