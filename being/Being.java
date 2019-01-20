package being;

public abstract class Being{
	private int code;
	private String name;
	
	public Being(int code, String name)
    {
        this.code=code;
        this.name=name;
    }
	
	public int get_Code(){
		return this.code;
	}
}