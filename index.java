package newpackage;

public class SergioLopezDev {

    private String name;
    private int age;

    public SergioLopezDev() {
        name = "";
        age = 0;
    }

    public SergioLopezDev(String name, int age) {
        this.name = name;
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;
            this.name = "INVALID PERSON";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;
            this.name = "INVALID PERSON";
        }
    }
    
    public static String help() {
        return "This class allows creating people "
                + "with a name and an age";
    }
    
    public static void main(String[] args) {
        SergioLopezDev person1 = new SergioLopezDev();
        SergioLopezDev person2 = new SergioLopezDev();
        
        person1.setName("Sergio Lopez");
        person1.setAge(41);
        
        person2.setName("Manolo");
        person2.setAge(180);
        
        System.out.println(help());
        System.out.println(person1.getName() + ", " + person1.getAge());
        System.out.println(person2.getName() + ", " + person2.getAge());
    }

}

public class SergioClass {

    public static void main(String[] args) {
        
        // VARIABLE CREATION:
        String name = "sergio lopez dev";
        
        // CHARACTER COUNT:
        int characterCount = name.length();
        
        System.out.println("The number of characters is " + characterCount);
        System.out.println("The number of characters is " + name.length());
        
        // FIRST CHARACTER:
        char first1 = name.charAt(name.length() - 17);
        char first2 = name.charAt(0);
        String first3 = name.substring(0, 1);
        
        System.out.println("The first character is " + first1);
        System.out.println("The first character is " + first2);
        System.out.println("The first character is " + first3);
        
        System.out.println("The first character is " + name.charAt(name.length() - 17));
        System.out.println("The first character is " + name.charAt(0));
        System.out.println("The first character is " + name.substring(0, 1));
        
        // LAST CHARACTER:
        char last1 = name.charAt(name.length() - 1);
        char last2 = name.charAt(15);
        String last3 = name.substring(15);
        
        System.out.println("The last character is " + last1);
        System.out.println("The last character is " + last2);
        System.out.println("The last character is " + last3);
        
        System.out.println("The last character is " + name.charAt(name.length() - 1));
        System.out.println("The last character is " + name.charAt(15));
        System.out.println("The last character is " + name.substring(15));
        
        // NAME:
        String namePart = name.substring(0, 6);
        
        System.out.println("The name is " + namePart);
        
        int startName = name.indexOf("sergio");
        int endName = namePart.length();
        
        System.out.println("The name is " + name.substring(startName, endName));
        
        // SECOND SURNAME:
        String surname = name.substring(13, 17);
        
        System.out.println("The second surname is " + surname);
        
        int startSurname = name.indexOf("dev");
        int endSurname = startSurname + surname.length();
        
        System.out.println("The second surname is " + name.substring(startSurname, endSurname));
        
        // REPLACE "E" WITH "_":
        System.out.println(name.replace("e", "_"));
        
        String replaced = name.replace("e", "_");
        System.out.println(replaced);
        
    }

}