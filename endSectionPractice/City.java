package myjavapackage.intermediate.endSectionPractice;

public class City {

    private Building[] buildings = new Building[4];

            public void city(){
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter Opener",1.5);
        bankItems[1] = new Item("Stamp",2.5);
        buildings[0] = new Building("Bank",bankItems);

        Item[] mansionItems = new Item[2];
        mansionItems[0] = new Item("Pair of Shoes",20.5);
        mansionItems[1] = new Item("Broken glass",0.5);
        buildings[1] = new Building("Mansion",mansionItems);

        Item[] postOffice = new Item[2];
        postOffice[0] = new Item("Letter to jenny",1.5);
        postOffice[1] = new Item("pencil",2.0);
        buildings[2] = new Building("PostOffice",postOffice);

        Item[] superMarket = new Item[2];
        superMarket[0] = new Item("A Loaf of Bread",2.5);
        superMarket[1] = new Item("A Bag of tea",6.5);
        buildings[3] = new Building("Supermarket",superMarket);

            }

    public Building[] getBuildings() {
        return buildings;
    }
}

