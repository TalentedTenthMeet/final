package ttt;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow.Builder;

public class person {
	
	private String userName;
	private String password;
	private String description;
	private int age;
	private double weight;
	private double height;
	private double minWeight;
	private double maxWeight;
	private int minAge;
	private int maxAge;
	private String id;
	private String imageUrl;
	
	
	public static final String USER_NAME = "userName";
	public static final String PASSWORD = "password";
	public static final String DESCRIPTION = "description";
	public static final Integer AGE	 = 18;
	public static final Double WEIGHT = 137.0;
	public static final Double MINWEIGHT = 0.0;
	public static final Double MAXWEIGHT = 0.0;
	public static final Integer MINAGE = 18;
	public static final Integer MAXAGE = 0;
	public static final String ID = "id"; 
	public static final String IMAGE_URL = "imageUrl";
	
	private person(Builder builder) {
		//this.userName = builder.userName;
	}

}
