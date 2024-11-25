package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;  
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more díc");

        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " have been added!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdLArray) {
        for (DigitalVideoDisc disc : dvdArray) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full. Can't add more discs");
                break;
            } else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more discs");

        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + dvd1.getTitle() + '\"' + " has been added!");

            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + dvd2.getTitle() + '\"' + " has been added!");

        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {        
        for (int i = 0; i < qtyOrdered; i++) {            
            if (itemsOrdered[i].equals(disc)) {                
                for (int j = i; j < qtyOrdered - 1; j++) {                    
                    itemsOrdered[j] = itemsOrdered[j + 1];                
                }                
                itemsOrdered[--qtyOrdered] = null;                
                System.out.println("The disc has been removed");                
                break;            
            }        
        }    
    }

    public float totalCost() {        
        float cost = 0;        
        for (int i = 0; i < qtyOrdered; i++) {            
            if (itemsOrdered[i] != null) {                
                cost += itemsOrdered[i].getCost();            
            }        
        }        
        return cost;    
    }

    public void searchById(int i) {
        if(i > qtyOrdered) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered[i-1].getTitle() +
                    "] - [" + itemsOrdered[i-1].getCategory() + "] - ["
                    + itemsOrdered[i-1].getDirector() + "] - ["
                    + itemsOrdered[i-1].getLength() + "]: " +itemsOrdered[i-1].getCost() + " $\n");
        }

    }

    public void searchByTitle(String title) {
        for(int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + itemsOrdered[i].getTitle() +
                        "] - [" + itemsOrdered[i].getCategory() + "] - ["
                        + itemsOrdered[i].getDirector() + "] - ["
                        + itemsOrdered[i].getLength() + "]: " +itemsOrdered[i].getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found !");
    }


}
