/**
 * 
 */
package challenge_MobilePhonesOnlineOOP;

/**
 * 
 */
public class MobilePhone {
	
	// Instance Variables
	
	private String make;
	private String model;
	private int rating;
	
	// Constructors
	
	/** 
	 * Default constructor
	 */
	
	public MobilePhone() {
		
	}
	
	/**
	 * Constructor with args creating a mobile phone with all details
	 * @param make
	 * @param model
	 * @param rating
	 */
	
	public MobilePhone(String make, String model, int rating) {
		this.make = make;
		this.model = model;
		this.setRating(rating);
		
	}
	
	// Getters and Setters
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * This method sets the rating with the business rule that ratings must be between 1 and 5
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		if (rating < 1 || rating > 5) {
			System.out.println("Invalid input rating");
		} else {
			this.rating = rating;
		}
	}

	// To String Method
	
	@Override
	public String toString() {
		return "MobilePhone [make=" + make + ", model=" + model + ", rating=" + rating + "]";
	}
	
	
	
	

}
