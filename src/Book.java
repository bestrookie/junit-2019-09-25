
public class Book
	{
	public String name;// ����
	public String author;// ����
	private int availNum;// �ɽ�����
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
	 * * ��ȡ�ɽ�����* * @return*/
	public int getAvailNum() 
		{
		return availNum;
		}
	/**
	 * * ���ÿɽ�����* * @param availNum*/
	public void setAvailNum(int availNum) 
	{
		this.availNum = availNum;
		}
	/**
	 * * Ԥ��* 
	 * * @return �ɹ�����true��ʧ�ܷ���false*/
	public boolean subscribe() 
	{
		if (availNum > 0) {
			availNum--;
			return true;
		}
		return false;
		}
	/**
	 * * ȡ��Ԥ��* * @return �ɹ�����true��ʧ�ܷ���false*/
	public boolean cancelSubscribe() {
		availNum++;
		return true;
		}
	}