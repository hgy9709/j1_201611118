class BMI {
  public String bmi(float height, float weight) {
    float bmi = weight /(height*height);
    System.out.printf("BMI = %.1f\n", bmi);
    
    if (bmi <= 18.5)
      return "low";
    else if (bmi >=18.5 && bmi< 23)
      return "normal";
		else if (bmi >= 23 && bmi < 25)
			return "risky";
		else if (bmi >= 25 && bmi < 30)
			return "obesity 1";
		else if (bmi >= 30 && bmi < 40)
			return "obesity 2";
		else if (bmi >= 40)
			return "obesity 3";
		else
			return "error";
	}
	
    public static void main(String[] args) {
    float weight = (float)69.0;
    float height = (float)1.7;
    System.out.print("BMI is" +new BMI().bmi(height,weight));
    }
}
    