RoomFactory factory = new RoomFactory();
        RoachMotel motel = new RoachMotel();
        
        motel.roomallocator();
        System.out.println(motel.printRoomsType());
        System.out.println( motel.rooms.get(0).getPrice());
        
        Room room_1 = factory.createRoom("regular");
        room_1.setRoom_number(100);
        System.out.println(room_1.getDescription()+ " Price: "+ room_1.getPrice());
        room_1 = new FoodBar(room_1);
        System.out.println(room_1.getDescription()+" Price: "+ room_1.getPrice());
        
