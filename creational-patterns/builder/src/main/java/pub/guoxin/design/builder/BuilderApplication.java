package pub.guoxin.design.builder;

import javafx.util.Builder;

/**
 * Created by guoxin on 17-9-11.
 */
public class BuilderApplication {
    public static void main(String[] args) {
        Person build = new Person.Builder().setAddress("北京北京").setAge(20).setId(1).setName("ww").build();
        System.out.println(build.toString());
    }
}
