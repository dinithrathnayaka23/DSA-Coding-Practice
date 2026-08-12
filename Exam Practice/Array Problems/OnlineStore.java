/*
4. Online Store — Search, Update and Delete

An online store maintains an array of product IDs:

[501, 523, 545, 567, 589, 601, 623]

The store receives a request to remove product ID 567.

Write a program that searches for the product ID first.

If the product exists:

Display its position.
Delete the product.
Shift the remaining elements.
Display the updated product list.

If the product doesn't exist, display:

Product not found.
*/

public class OnlineStore {
    public static void main(String[]args){
        int productID[]=new int[7];
        productID[0]=501;
        productID[1]=523;
        productID[2]=545;
        productID[3]=567;
        productID[4]=589;
        productID[5]=601;
        productID[6]=623;
        int deleteIndex = -1;
        for (int i = 0; i < productID.length; i++) {
            if (productID[i] == 567) {
                deleteIndex = i;
                System.out.println("Index of Delete ID: " + i);
                break;
            }
        }
        if (deleteIndex == -1) {
            System.out.println("Product not found.");
            return;
        }
        for (int i = deleteIndex; i < productID.length - 1; i++) {
            productID[i] = productID[i + 1];
        }
        System.out.println("Updated Product List:");
        for (int i = 0; i < productID.length - 1; i++) {
            System.out.print(productID[i] + " ");
        }
    }
}
