package day_49;

public class BinaryString {
	public String findDifferentBinaryString(String[] nums) {
		StringBuilder ans= new StringBuilder();
		for(int i=0;i<nums.length;i++){
			ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		BinaryString obj = new BinaryString ();
		String[] nums = {"01", "10"}; // Example input
		String result = obj.findDifferentBinaryString(nums);
		System.out.println("Different Binary String: " + result);
	}
}
