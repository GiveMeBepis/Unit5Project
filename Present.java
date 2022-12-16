public class Present {
    private boolean isWrapped;
    private boolean isPacked;
    public static int presents;

    public Present(Elf elf) {
        if(elf.getJob().equals("Toy Maker")) 
        {
            isWrapped = false;
            isPacked = false;
            presents++;
        }
        else 
        {
            System.out.println("This elf does not know how to make toys!");
        }
    }

    public void wrap(Elf elf) 
    {
        if(elf.getJob().equals("Gift Wrapper")) 
        {
            isWrapped = true;
        }
        else 
        {
            System.out.println("Your elf is not a wrapper!");
        }
    }

    public void pack(Elf elf) 
    {

        if(elf.getJob().equals("Sack Packer")) 
        {
            isPacked = true;
        }
        else 
        {
            System.out.println("Your elf is not a sack packer!");
        }
    }
}
