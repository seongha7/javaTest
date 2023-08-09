package com.example.javatest;



enum Direction {EAST, SOUTH, WEST, NORTH}

class EnumEx {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1=" + d1);
        System.out.println("d2=" + d2);
        System.out.println("d3=" + d3);

        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

        switch (d1) {
            case EAST:
                System.out.println("the direction is east"); break;
            case SOUTH:
                System.out.println("the direction is south"); break;
            case WEST:
                System.out.println("the direction is west"); break;
            case NORTH:
                System.out.println("the direction is north"); break;
            default:
                System.out.println("invaild direction"); break;
        }

        Direction [] dArr = Direction.values();

        for(Direction d : dArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }

    }
}
