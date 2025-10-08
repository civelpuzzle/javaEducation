import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pz6 {
    public static void main(String[] args){
        String text = "Даны формулы: H2O, C6H12O6, CO2, NH3, CH4, C2H6, H2SO4, NO2, HCl, CaCO3, Fe2O3";

        Pattern pattern = Pattern.compile("[A-Z][A-Za-z0-9]+");
        Matcher matcher = pattern.matcher(text);

        Set<String> formulas = new HashSet<>();
        while (matcher.find()){
            formulas.add(matcher.group());
        }
        System.out.println(formulas);
        String[] formulasArray = formulas.toArray(new String[0]);

        Arrays.stream(formulasArray).forEach(x -> System.out.println(x + " -> " + listElements(x)));

    }

    public static Map<String, Integer> listElements(String formula){

        Map<String, Integer> kolElements = new HashMap<>();

        Pattern pattern = Pattern.compile("[A-Z][a-z]*\\d*");
        Matcher matcher = pattern.matcher(formula);

        ArrayList<String> elements = new ArrayList<>();
        while (matcher.find()){
            elements.add(matcher.group());
        }

        for (String e: elements) {
            if (!e.matches(".*\\d+.*")) {
                kolElements.put(e, 1);
            } else {
                kolElements.put(e.replaceAll("\\d", ""), Integer.parseInt(e.replaceAll("[A-Za-z]", "")));
            }
        }

        return kolElements;
    }
}
