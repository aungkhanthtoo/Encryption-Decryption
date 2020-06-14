class Cat {

    // write static and instance variables
    static int numberOfCats = 0;
    final String name;
    final int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfCats++;
        if (numberOfCats > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }
}