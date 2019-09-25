
public class Book
	{
	public String name;// 书名
	public String author;// 作者
	private int availNum;// 可借数量
	public Book()
		{
		this("", "", 0);
		}
	public Book(String name, String author, int availNum) 
		{
		this.name = name;
		this.author = author;
		this.availNum = availNum;
		}
	/**
	 * * 获取可借数量* * @return*/
	public int getAvailNum() 
		{
		return availNum;
		}
	/**
	 * * 设置可借数量* * @param availNum*/
	public void setAvailNum(int availNum) 
	{
		this.availNum = availNum;
		}
	/**
	 * * 预借* 
	 * * @return 成功返回true，失败返回false*/
	public boolean subscribe() 
	{
		if (availNum > 0) {
			availNum--;
			return true;
		}
		return false;
		}
	/**
	 * * 取消预借* * @return 成功返回true，失败返回false*/
	public boolean cancelSubscribe() {
		availNum++;
		return true;
		}
	}