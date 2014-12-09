package com.cloudsherpas


import com.google.i18n.phonenumbers.AsYouTypeFormatter;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberToCarrierMapper;
import com.google.i18n.phonenumbers.PhoneNumberToTimeZonesMapper;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.geocoding.PhoneNumberOfflineGeocoder;
import org.apache.log4j.Logger

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Util {}
object Util {
	def usage() : Unit = {
		println("""Usage:
  												|configFile extract [--truncate|--upsert] [--all]
													|configFile schema [--all] [--execute-sql]""".stripMargin)
	}
	
	def main(tmpArgs: Array[String]) {
    var  phoneUtil = PhoneNumberUtil.getInstance();
    val result = phoneUtil.parseAndKeepRawInput("+33 303 3303033","US")
    val br = new BufferedReader(new InputStreamReader(System.in));
    println(List("id","input_phone","country","national_phone","extension").mkString("\t"))
    var input = br.readLine();
    val output = scala.collection.mutable.ArrayBuffer[String]()
    output.clear()
    while(input!=null){
    	val line = input.split("\t")
    	try {
    		val result = phoneUtil.parseAndKeepRawInput(line(1),"US")
    		println(List(line(0),line(1),result.getCountryCode(),result.getNationalNumber(),result.getExtension()).mkString("\t"))
    	} catch {
    		case e : Exception => {
    			println(List(line(0),line(1),"","","","INVALID").mkString("\t"))
    			
    		} 
    		case _ : Throwable => 
    	}
      input = br.readLine();
    }

  	val log = Logger.getLogger(this.getClass)
  	val args = tmpArgs.toList
  	if (args.length < 2) usage() 
  	else {
  	val configFile = args(0)
  	val command = args(1).toLowerCase()
  	val params = args.drop(2).map(_.toLowerCase())
/*  	
  	(command,args) match {
  		case ("schema",args) => DoMetadata.processAll(configFile,args.contains("--execute-sql"), args.contains("--all"))
  		case ("extract",args) => DoExtract.processAll(configFile,args.contains("--truncate"),args.contains("--all"),args.contains("--upsert"))
  		case _ => usage()
  	} */
  	
  	}
  }
  

}