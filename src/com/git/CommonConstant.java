package com.git;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class CommonConstant {
	static String REP_NAME;

	public static final String WEBSITE_ADDRESS = "https://www.github.com/";
	public static final String EMAIL_ADDRESS = "karishmakhanbangalore@outlook.com";
	public static final String PASSWORD_ADDRESS = "Testing@1221";
	public static final String SINGIN_BUTTON_PATH = "/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a";
	public static final String EMAIL_PATH = "//*[@id=\"login_field\"]";
	public static final String PASSWORD_PATH = "//*[@id=\"password\"]";
	public static final String SINGIN_PATH = "//*[@id=\"login\"]/div[4]/form/div/input[13]";
	public static final String NEW_BTN_PATH = "/html/body/div[1]/div[6]/div/div/aside/div/div/loading-context/div/div[1]/div/h2/a/span";
	public static final String REP_NAME_PATH = "//*[@id=\":r2:\"]";
	public static String  F_REP_NAME ="";
	public static final String CREAT_PATH = "/html/body/div[1]/div[6]/main/react-app/div/form/div[5]/button/span/span";
	public static final String SCROLL_WINDOW_DOWN_SIZE = "window.scrollBy(0,350)";
	public static final String actualUrl="https://github.com/karishmakhan12/Git_Automation_Code10";
	public static final String PROFILE_URL = "https://github.com/karishmakhan12";
	public static final String YOUR_REPRO = "//*[@id=\"item-9f850a63-81e2-4974-845a-2f5118ae869d\"]/span[2]";
	public static final String ACTUAL_NAME ="karishma khan";
	public static final String NAME = "/html/body/div[1]/div[6]/main/div/div/div[1]/div/div/div[1]/div[2]/h1/span[1]";
	public static final String REPRO_URL= "https://github.com/karishmakhan12?tab=repositories";
	public static final String DASHBOARD_URL = "https://github.com/";
	public static final String ACTUAL_NAME_ON_REPROPAGE ="/html/body/div[1]/div[4]/main/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/h1/span[1]";
	public static final String UI_OF_REPROLIST= "/html/body/div[1]/div[4]/main/div[1]/div/div/div[2]/div/nav/a[2]/span";
	public static final String SETTING_BTN ="//*[@id=\"settings-tab\"]";
	public static final String DELETE_PATH ="//*[@id=\"dialog-show-repo-delete-menu-dialog\"]/span/span";
	public static final String DELETE_REPO_TEXT= "//*[@id=\"repo-delete-proceed-button\"]/span/span";
	public static final String RAED_AGREE_LINK = "//*[@id=\"repo-delete-proceed-button\"]/span/span";
	public static final String  DELETE_REPO_NAME ="//*[@id=\"repo-delete-proceed-button-container\"]/input";
	public static final String DELETE_VERIFICATION_FIELD ="//*[@id=\"verification_field\"]";
	public static final String DELETE= "//*[@id=\"repo-delete-proceed-button\"]/span/span";
		
	public static String setGitRepoName () {
		String timeSTamp = new SimpleDateFormat("yyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		String rep_name = "GIT_" + timeSTamp;
		System.out.println(rep_name);
		 F_REP_NAME = rep_name;
		return rep_name;
		
	}

}

