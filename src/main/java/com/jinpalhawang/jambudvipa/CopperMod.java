package com.jinpalhawang.jambudvipa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.jinpalhawang.jambudvipa.block.ModBlocks;
import com.jinpalhawang.jambudvipa.item.ModItems;
import com.jinpalhawang.jambudvipa.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
    modid = CopperMod.MODID,
    name = CopperMod.MODNAME,
    version = CopperMod.VERSION)
public class CopperMod {

  public static final String MODID = "coppermod";
  public static final String MODNAME = "Copper Mod";
  public static final String VERSION = "1.0.0";

  @SidedProxy(
      serverSide = "com.jinpalhawang.jambudvipa.proxy.CommonProxy",
      clientSide = "com.jinpalhawang.jambudvipa.proxy.ClientProxy")
  public static CommonProxy proxy;

  @Instance
  public static CopperMod instance;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    System.out.println(MODNAME + " is loading!");
    ModItems.init();
    ModBlocks.init();

    try {
      URL url = new URL("http://www.google.com");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("Accept", "application/json");

      if (conn.getResponseCode() != 200) {
        throw new RuntimeException("Failed : HTTP error code : "
            + conn.getResponseCode());
      }

      BufferedReader br = new BufferedReader(new InputStreamReader(
        (conn.getInputStream())));

      String output;
      System.out.println("Output from Server .... \n");
      while ((output = br.readLine()) != null) {
        System.out.println(output);
      }

      conn.disconnect();

    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @EventHandler
  public void init(FMLInitializationEvent e) {
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent e) {
  }

}