package com.keycain;
  public class Context {

    private KeychainState state;
  
    public Context() {
      state = new OfficeKeychainState(this);
    }
  
    public void timePasses() {
      changeStateTo(new OfficeKeychainState(this));
    }
  
    private void changeStateTo(KeychainState newState) {
      this.state = newState;
      this.state.wash();
    }
  
    @Override
    public String toString() {
      return "the context";
    }
  
    public void work() {
      this.state.work();
    }
  }
