else if(nch==2){
		   LinearProbing<String> s=new LinearProbing<>(size);
		while(true){
		System.out.println("1.Insert");
           	System.out.println("2.Delete");
	   	System.out.println("3.Search");
	   	System.out.println("4.Display");
           	System.out.println("5.Exit\nEnter your choice:");
	   	int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sc.nextLine();
			System.out.println("Enter the key value:");
			int key=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Name:");
			String name=sc.nextLine();
			System.out.println("Enter the Age:");
			int age=Integer.parseInt(sc.nextLine());
			boolean res=s.insert(key,name,age);
			if(!res)
				System.out.println("Can't Insert.Hash Table is full!");
			break;
		case 2:
			sc.nextLine();
			System.out.println("Enter the key value:");
			int k1=sc.nextInt();
			boolean d=s.delete(k1);
			if(d)
				System.out.println(k1+" deleted from Hash Table");
			else
				System.out.println(k1+" not available Hash Table");
			break;
		case 3:
			sc.nextLine();
			System.out.println("Enter the key value:");
			int k=sc.nextInt();
			KeyValue<Integer> n=s.get(k);
			if(n!=null)
				System.out.println("Voter Id: "+n.key+"\n"+"Name	: "+n.name+"\n"+"Age	: "+n.age);
			else
				System.out.println(k1+" not available Hash Table");
			break;
		case 4:
			System.out.printf("%-11s%-15s%-11s%s\n","ID","Name","Age","Index");
			System.out.println("---------------------------------------------");
			int j=0;
			KeyValue<Integer> arr[]=s.getList();
			while(j<size){
				if(arr[j]!=null)
				System.out.printf("%-11s%-15s%-11s%s\n",arr[j].key,arr[j].name,arr[j].age,j);
				j++;
			}
			System.out.println();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Entry\n");
			break;
		}
	   }
	}
     }
}


