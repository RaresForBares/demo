package de.cloud.input;

import de.cloud.input.commands.COMMANDS_Info;
import de.cloud.input.commands.Command;

import java.util.ArrayList;
import java.util.Properties;

public class CommandMaster {

   public static ArrayList<Command> commands = new ArrayList<>();
Properties p = new Properties();

public static void setup(){

    new COMMANDS_Info("info", "get Info", new String[]{"info", "i"});
}

  public static void PushnewCommand(Command c) {

      commands.add(c);


  }

}
