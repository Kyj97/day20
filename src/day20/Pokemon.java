package day20;

class Pokemon {
	  public static int count = 0;
	    int idx = 0;
	    protected String owner =null ;
	    protected String[] skills ;
	    protected String skill ;

	    public  Pokemon() {
	    	System.out.print("���ϸ� ����:");
	    }
	    public Pokemon (String owner, String skill, int idx) {
	        this.owner = owner;
	        this.skills = skill.split("/");
	        this.idx = idx ;
	        System.out.print("���ϸ� ����:");
	        count = count + 1 ;
	    }
	    public void info() {
	        System.out.printf("%s�� ���ϸ��� ��� ������ ��ų\n", owner);
	        for (int i = 0; i < skills.length; i++) {
	            System.out.printf("%d : %s\n", i + 1, skills[i]);
	        }
	    }
	    public void attack(int a){
	        System.out.printf("%s ���� ����!", skills[a-1]);
	    }
	        
}
