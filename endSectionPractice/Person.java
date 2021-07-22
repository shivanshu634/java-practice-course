package myjavapackage.intermediate.endSectionPractice;

public abstract class  Person {

    private String name;
    private String nickname;
    private int yearOfBorn;
    private String expertIn;
    Item[] items;

    public Person(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }

    public void printBioData(){
        System.out.println("Name: "+name);
        System.out.println("Nickname: "+nickname);
        System.out.println("Year of Born: "+yearOfBorn);
        System.out.println("Expert IN: "+expertIn);
        for(Item item : items){
            System.out.println("-"+ item.getName());
        }

    }

    public String getName(){
        return name;
    }

    public String getNickname(){
        return nickname;
    }
}
