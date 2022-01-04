class Result{
	public static void main(String[] marks){
		for(int mark=0; mark <marks.length; mark++){ jh
		 String cgpa = marks[mark];
		float per=Float.parseFloat(cgpa);
		int percentage = Integer.parseInt(cgpa);
		byte percentag = Byte.parseByte (cgpa);
		short percent = Short.parseShort (cgpa);
		long avrage = Long.parseLong (cgpa);
		double avg = Double.parseDouble (cgpa);
		System.out.println(cgpa+"\t"+per+"\t"+percentage+"\t"+percentag+"\t"+percent+"\t"+avrage+"\t"+avg);
		
		
		}
	}
}