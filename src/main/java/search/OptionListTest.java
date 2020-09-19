package search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OptionListTest {

    private class Sample{
        private int value;

        private String name;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<Sample> list = new ArrayList<>();
        List<Sample> result = list.stream()
                .filter(a -> a.name.equals("three"))
                .collect(Collectors.toList());

        for(Sample sample : result) {
            System.out.println(sample.name);
        }
    }
}
