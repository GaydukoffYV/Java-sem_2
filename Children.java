class Children extends People implements FatherIn {
    private Integer motherId;
    private Integer fatherId;
    private Integer grandmotherId;
    private Integer grandfatherId;

    public Integer getMotherId(){
        return motherId;
    }
    public Integer getFatherId(){
        return fatherId;
    }
    public Integer getGrandmotherId(){
        return grandmotherId;
    }
    public Integer getGrandfatherId(){
        return grandfatherId;
    }
    public void setMotherId(){
        this.motherId = motherId;
    }
    public void setFatherId(){
        this.fatherId = fatherId;
    }
    public void setGrandmotherId(){
        this.grandmotherId = grandmotherId;
    }
    public void setGrandfatherId(){
        this.grandfatherId = grandfatherId;
    }

    public Children(int i, String string, String string2, int j, String string3) {
        super(i, string, string2, j, string3);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Hello(){
        System.out.println("Пока!");
    }
    @Override
    public void getFlexibility() {
      System.out.println("Гибкий");
        
    }
    @Override
    public void getForce() {
        System.out.println("Сильный");
        
    }
    @Override
    Public void getHello1();
}
