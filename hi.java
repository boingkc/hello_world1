class Home{
  private List<Component> component;
  private List<People> member;
  private String description;


  public Home(String desc){
    component = new ArrayList<>();
    member = new ArrayList<>();
    description = desc;
  }

  public Home(){
    component = new ArrayList<>();
    member = new ArrayList<>();

  }

  public setDescription(String freeDes){
    description = freeDes;


  }
  public addComponent(Component componentObj){
    component.add(componentObj);

  }
  @override
  public toString(){
    system.out.println(component.toString());
  }



}
