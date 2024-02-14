class Level
{
    public static void main(String a[])
    {
        int x = 10;

        if(x <= 10)
        System.out.println("Low Battery");
        else if(x > 30 && x <= 50)
        System.out.println("Medium");
        else if(x == 50)
        System.out.println("Full");
    }    
}

