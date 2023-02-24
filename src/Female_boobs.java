public class Female_boobs {
   private String name = "name";
   private Integer age = 18;
   private Integer size = 5;

    public Female_boobs(String name,Integer age, Integer size){
        this.name = name;
        this.age = age;
        this.size = size;
    }
    public Integer size(){
        return this.size;
    }

    @Override
    public String toString() {
        return "Female_boobs{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Size=" + size +
                '}';
    }
}
