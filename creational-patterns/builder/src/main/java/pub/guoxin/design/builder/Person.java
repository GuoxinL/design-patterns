package pub.guoxin.design.builder;

/**
 * Created by guoxin on 17-9-11.
 */
public class Person {
    private final int id;
    private final int age;
    private final String name;
    private final String address;

    private Person(Builder builder) {
        this.id = builder.id;
        this.age = builder.age;
        this.name = builder.name;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder implements javafx.util.Builder<Person> {
        private int id;
        private int age;
        private String name;
        private String address;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }


        @Override
        public Person build() {
            return new Person(this);
        }
    }
}
