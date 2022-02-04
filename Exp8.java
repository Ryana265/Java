package JLab;
abstract  class animals
{
    protected  int legs;
    protected animals(int legs)
    {
        this.legs=legs;
    }

    void walks()
    {
        System.out.println("animals has "+legs+" legs");
    }
    abstract void eats();
}
class  Spider extends animals
{
Spider(){
     super(8);
 }
    @Override
    void eats() {
   System.out.println("spider eats insets");
    }

}
interface pet{
    void setName(String name);
    String getName();
    void play();
}
class cat extends animals implements pet
{ String name;
    cat(String nam)
    {
        super(4);
        name=nam;
    }
   cat()
{
    this("");
}
    @Override
    void eats() {
        System.out.println("cat eats fish");
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
System.out.println("cat play with balls");
    }
}
class fish extends animals implements pet
{
    String name;
fish(String name)
{
    super(0);
    this.name=name;
}
    @Override
    void eats() {
        System.out.println("fish eats fishfood");
    }

    @Override
    public void setName(String name) {
    this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("fish plays ");
    }
    @Override
    public void walks()
    {
        System.out.println("Fish has no legs");
    }
}
public class Interface {
    public static void main(String[] args) {
        System.out.println("FISH");
        fish f=new fish("Mimi");
        System.out.println("This fish's name is "+f.getName());
        f.eats();
        f.walks();
        f.setName("momo");
        System.out.println("This fish's name is "+f.getName()+"\n");
        System.out.println("CAT");
        cat c= new cat("Fluffy");
        System.out.println("This Cat's name is "+c.getName());
        c.walks();
        c.eats();
        c.setName("Moose");
        System.out.println("This Cat's name is "+c.getName()+"\n");
        System.out.println("SPIDER");
        Spider s= new Spider();
        s.eats();
        s.walks();
    }
}
