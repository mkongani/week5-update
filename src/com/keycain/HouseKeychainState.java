package com.keycain;

public class HouseKeychainState implements KeychainState {
  
    private final Context context;
  
    public HouseKeychainState(Context context) {
      this.context = context;
    }
  
    @Override
    public void work() {
      System.out.println("House Keychain is working...");
    }
  
    @Override
    public void wash() {
      System.out.println("Wash the House Keychain...");
    }
  }