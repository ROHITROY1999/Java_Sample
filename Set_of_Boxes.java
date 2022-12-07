import java.util.*;
class Box {
    double length, width, height, volume;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
        this.setVolume();
    }
    public void setLength(double newLength) { this.length = newLength; }
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
    public void setVolume() {
        this.volume = this.length * this.width * this.height;
    }
    public double getLength() { return this.length; }
    public double getWidth() { return this.width; }
    public double getHeight() { return this.height; }
    public double getVolume() { return this.length * this.width * this.height; }
    public boolean equals(Object o)
    {
        double this_vol = this.length * this.width * this.height;
        Box newBox = (Box) o;
        double other_vol = newBox.length * newBox.width * newBox.height;
        if (this_vol == other_vol) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString()
    {
        return "Length = " + this.length + " Width = " + this.width + " Height = " + this.height + " Volume = " + this.volume;
    }
}
public class Set_of_Boxes
{
    public static void main(String[] args)
    {
        HashSet<Box> hash_box = new HashSet<Box>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Boxes: ");
        int total = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < total; i++) {
            System.out.println("Enter the Box " + (i + 1) + " details: ");
            System.out.println("Enter Length: ");
            double length = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Width: ");
            double width = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Height: ");
            double height = sc.nextDouble();
            sc.nextLine();
            Box box = new Box(length, width, height);
            if (i == 0) {
                hash_box.add(box);
            }
            int flag = 0;
            for (Box myBox : hash_box) {
                if (box.volume == myBox.volume) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                hash_box.add(box);
            }
        }
        for(Box mybox : hash_box)
        {
            System.out.println(mybox.toString());
        }
    }
}
