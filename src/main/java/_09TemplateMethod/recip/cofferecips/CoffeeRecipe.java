package _09TemplateMethod.recip.cofferecips;

import _09TemplateMethod.recip.template.Recipe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeRecipe extends Recipe {

    @Override
    public void brew() {
        System.out.println("Brewing the coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and sugar");
    }

    /// using Hooks !@#
    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {

        String answer = null;

        System.out.println("Would you like mil an sugar with your coffee ? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException io) {
            System.err.println("IO error, trying to read your answer.");
        } if (answer == null) {
            return "no";
        }
        return answer;
    }
}
