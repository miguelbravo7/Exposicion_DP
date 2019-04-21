package builder1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new UserBuilder().age(21).profession("Ingeniero").
				familyName("Hernández").phone(666666666).tag("socio").tag("ejecutivo").Build();
		
		User user2 = new UserBuilder().byDefault("sufijo").Build();
		
		User user3 = new UserBuilder().byDefault().Build();

	}

}
