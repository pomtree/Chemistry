package com.company;

public class Element {
    private  int atomic_number;
    private int[] oxidation_states;
    private boolean is_metal;
    private String symbol;
    private String name;

    public Element(int Matomic_number,int[] Moxidation_states, boolean Mis_metal, String Msymbol, String Mname) {
        atomic_number = Matomic_number;
        oxidation_states = Moxidation_states;
        is_metal = Mis_metal;
        symbol = Msymbol;
        name = Mname;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isIs_metal() {
        return is_metal;
    }

    public int[] getOxidation_states() {
        return oxidation_states;
    }

    public int getAtomic_number() {
        return atomic_number;
    }
    public static Element[] generateTable() {
        Element table[] = new Element[36];
        table[1] = new Element(1,new int[]{1,-1},false,"H","Hydrogen");
        table[2] = new Element(2,new int[]{0},false,"He","Helium");
        table[3] = new Element(3,new int[]{1},true,"Li","Lithium");
        table[4] = new Element(4,new int[]{2},true,"Be","Beryllium");
        table[5] = new Element(5,new int[]{3},false,"B","Boron");
        table[6] = new Element(6,new int[]{2,4,-4},false,"C","Carbon");
        table[7] = new Element(7,new int[]{2,3,4,5,-2,-3},false,"N","Nitrogen");
        table[8] = new Element(8,new int[]{-2},false,"O","Oxygen");
        table[9] = new Element(9,new int[]{-1},false,"F","Fluorine");
        table[10] = new Element(10,new int[]{0},false,"Ne","Ne");
        table[11] = new Element(11,new int[]{1},true,"Na","Sodium");
        table[12] = new Element(12,new int[]{2},true,"Mg","Magnesium");
        table[13] = new Element(13,new int[]{3},true,"Al","Aluminum");
        table[14] = new Element(14,new int[]{2,4,-4},false,"Si","Silicon");
        table[15] = new Element(15,new int[]{3,4,5,-3},false,"P","Phosphorus");
        table[16] = new Element(16,new int[]{3,4,5,-3},false,"P","Phosphorus");
        table[17] = new Element(17,new int[]{1,3,5,7,-1},false,"Cl","Chlorine");
        table[18] = new Element(18,new int[]{0},false,"Ar","Argon");
        table[19] = new Element(19,new int[]{1},true,"K","Potassium");
        table[20] = new Element(20,new int[]{2},true,"Ca","Calcium");
        table[21] = new Element(21,new int[]{3},true,"Sc","Scandium");
        table[22] = new Element(22,new int[]{2,3,4},true,"Ti","Titanium");
        table[23] = new Element(23,new int[]{2,3,4,5},true,"V","Vanadium");
        table[24] = new Element(24,new int[]{2,3,6},true,"Cr","Chromium");
        table[25] = new Element(25,new int[]{2,3,4,6,7},true,"Mn","Manganese");
        table[26] = new Element(26,new int[]{2,3},true,"Fe","Iron");
        table[27] = new Element(27,new int[]{2,3},true,"Co","Cobalt");
        table[28] = new Element(28,new int[]{2,3},true,"Ni","Nickel");
        table[29] = new Element(29,new int[]{1,2},true,"Cu","Copper");
        table[30] = new Element(30,new int[]{2},true,"Zn","Zinc");
        table[31] = new Element(31,new int[]{3},true,"Ga","");
        table[32] = new Element(32,new int[]{},true,"","");
        table[33] = new Element(33,new int[]{},true,"","");
        table[34] = new Element(34,new int[]{},true,"","");
        table[35] = new Element(35,new int[]{},true,"","");
        table[36] = new Element(36,new int[]{},true,"","");
        return table;
    }
}
