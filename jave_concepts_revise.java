package java_concepts_revision;

public class jave_concepts_revise {
	
	
		public static void main(String[] args) {
			
			// boolean and && 
			boolean have_car = true;
			boolean known_how_to_drive = true;
			boolean can_drive = false;
			
			if(have_car) {
				if(known_how_to_drive) {
					can_drive = true;
				}
			}
			if (have_car && known_how_to_drive) {
				can_drive = true;
			}
			System.out.println(can_drive);
			
			can_drive = have_car&&known_how_to_drive ? true:false;
			
			
			// now we use boolean OR.
			
			boolean buy_car= false;
			boolean rent_car=false;
			boolean drive_car=false;
			
			drive_car = buy_car || rent_car;
			System.out.println(drive_car);
			
			
			// complex boolean expression 
			
			boolean license_have = false;
			boolean have_ID = false;
			boolean over_speeding_ticket= true;
			if ((license_have || have_ID) && over_speeding_ticket ) {
				System.out.println("you have fine");
			}
			else{
				System.out.println("sent to jail");
			}
			
			boolean	fine = license_have || have_ID;
			if(fine && over_speeding_ticket)
			{
				System.out.println("you have 500 fine ticket");
			}
			else {
				System.out.println("jail time");
			}
			
		}
	}


