package gr.sr.javaBuffer.buffNpc.dynamicHtmls;

import java.util.List;

import l2r.gameserver.model.actor.instance.L2PcInstance;

import gr.sr.javaBuffer.BufferMenuCategories;
import gr.sr.javaBuffer.BufferPacketCategories;
import gr.sr.javaBuffer.BufferPacketSender;
import gr.sr.javaBuffer.BuffsInstance;
import gr.sr.javaBuffer.PlayerMethods;
import gr.sr.javaBuffer.xml.dataHolder.BuffsHolder;

/**
 * @author L2jSunrise Team
 * @Website www.l2jsunrise.com
 */
public class GenerateHtmls
{

	//	private static final String _headHtml = "<html noscrollbar><title>Npc Buffer</title><body><table cellpadding=1 cellspacing=1 width=290 height=359 background=\"L2UI_CH3.refinewnd_back_Pattern\"><tr><td valign=\"top\" align=\"center\">";
	//	private static final String _endHtml = "</td></tr></table></body></html>";
	
	/**
	 * Shows the available profiles to edit
	 * @param player
	 * @param action
	 * @param objectId
	 */
	public static void showSchemeToEdit(L2PcInstance player, String action, int objectId)
	{
		List<String> profileNames = PlayerMethods.getProfiles(player);
		
		StringBuilder tb = new StringBuilder();
		tb.append("<html noscrollbar><title>Npc Buffer</title><body><table cellpadding=1 cellspacing=1 width=290 height=359 background=\"L2UI_CH3.refinewnd_back_Pattern\"><tr><td valign=\"top\" align=\"center\">");
		tb.append("<table width=265>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("<tr><td align=center><font color=7401DF name=\"hs12\">Chose the Profile</font><br></td></tr>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("</table>");
		tb.append("<table width=265>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Profiles:</font><br></td></tr>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("</table>");
		for (String profile : profileNames)
		{
			tb.append("<table width=260 cellpadding=1 cellspacing=1>");
			tb.append("<tr><td align=center><button value=\"" + profile + "\" action=\"bypass -h npc_%objectId%_" + action + "_" + profile + "\" width=200 height=27 back=\"L2UI_CT1.Button_DF_Down\" fore=\"L2UI_CT1.Button_DF\"></td></tr>");
			tb.append("</table>");
		}
		tb.append("<table width=290 cellpadding=1 cellspacing=1>");
		tb.append("<tr><td height=25></td></tr>");
		tb.append("<tr><td align=center><button action=\"bypass -h npc_%objectId%_Chat_main.htm\" width=50 height=30 back=\"L2UI_ct1.Inventory_DF_Btn_RotateRight_Down\" fore=\"L2UI_ct1.Inventory_DF_Btn_RotateRight\"></td></tr>");
		tb.append("</table>");
		tb.append("</td></tr></table></body></html>");
		
		BufferPacketSender.sendPacket(player, tb.toString(), BufferPacketCategories.DYNAMIC, objectId);
	}
	
	/**
	 * Shows the available buffs to add to a profile
	 * @param player
	 * @param profile
	 * @param category
	 * @param bypass
	 * @param objectId
	 */
	public static void showBuffsToAdd(L2PcInstance player, String profile, BufferMenuCategories category, String bypass, int objectId)
	{
		List<Integer> ownedBuffs = PlayerMethods.getProfileBuffs(profile, player);
		int i = 0;
		
		StringBuilder tb = new StringBuilder();
		tb.append("<html noscrollbar><title>Npc Buffer</title><body><table cellpadding=1 cellspacing=1 width=290 height=359 background=\"L2UI_CH3.refinewnd_back_Pattern\"><tr><td valign=\"top\" align=\"center\">");
		tb.append("<table width=265>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("<tr><td align=center><font color=7401DF name=\"hs12\">Chose the Buffs</font><br></td></tr>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("</table>");
		switch (category)
		{
			case CHANT:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Chant</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case DANCE:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Dance</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case SONG:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Song</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case OVERLORD:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Overlord</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case PROPHET:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Prophet</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case ELDER:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Elder</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case DWARF:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Dwarf</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			case MISC:
				tb.append("<table width=265>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buffer: Misc</font><br></td></tr>");
				tb.append("<tr><td height=15></td></tr>");
				tb.append("</table>");
				break;
			default:
				break;
		}

		for (BuffsInstance buffInst : BuffsHolder.getInstance().getBuffs().values())
		{
			// Just a check to know if this buff
			// Is in the category we wish to be
			if (buffInst.getCategory() != category)
			{
				continue;
			}
			
			int id = buffInst.getId();
			Integer level = buffInst.getLevel();
			String description = buffInst.getDescription();
			String name = buffInst.getName();
			
			// Check if the buff id exists in the owned buffs list
			// Remember the l2pc has only the buffId contained
			if ((ownedBuffs != null) && ownedBuffs.contains(id))
			{
				continue;
			}
			
			if ((i % 2) == 0)
			{
				tb.append("<table width=260 cellpadding=1 cellspacing=1 bgcolor=131210>");
			}
			else
			{
				tb.append("<table width=260 cellpadding=1 cellspacing=1>");
			}
			tb.append("<tr>");
			if ((id == 4699) || (id == 4700))
			{
				tb.append("<td width=40><button action=\"bypass -h npc_%objectId%_" + bypass + "_" + profile + "_" + id + "\" width=32 height=32 back=\"icon.skill1331\" fore=\"icon.skill1331\"></td>");
			}
			if ((id == 4702) || (id == 4703))
			{
				tb.append("<td width=40><button action=\"bypass -h npc_%objectId%_" + bypass + "_" + profile + "_" + id + "\" width=32 height=32 back=\"icon.skill1332\" fore=\"icon.skill1332\"></td>");
			}
			if (id < 1000)
			{
				tb.append("<td width=40><button action=\"bypass -h npc_%objectId%_" + bypass + "_" + profile + "_" + id + "\" width=32 height=32 back=\"icon.skill0" + id + "\" fore=\"icon.skill0" + id + "\"></td>");
			}
			if ((id > 1000) && (id != 4699) && (id != 4700) && (id != 4702) && (id != 4703))
			{
				tb.append("<td width=40><button action=\"bypass -h npc_%objectId%_" + bypass + "_" + profile + "_" + id + "\" width=32 height=32 back=\"icon.skill" + id + "\" fore=\"icon.skill" + id + "\"></td>");
			}
			tb.append("<td><table>");
			tb.append("<tr><td width=220>" + name + "<font color=a1a1a1> Lv</font> <font color=ae9977>" + level + "</font></td></tr>");
			tb.append("<tr><td width=220><font color=b0bccc>" + description + "</font></td></tr></table></td></tr>");
			tb.append("</table>");
			i++;
		}
		tb.append("<table width=290 cellpadding=1 cellspacing=1>");
		tb.append("<tr><td height=25></td></tr>");
		tb.append("<tr><td align=center><button action=\"bypass -h npc_%objectId%_Chat_main.htm\" width=50 height=30 back=\"L2UI_ct1.Inventory_DF_Btn_RotateRight_Down\" fore=\"L2UI_ct1.Inventory_DF_Btn_RotateRight\"></td></tr>");
		tb.append("</table>");
		tb.append("</td></tr></table></body></html>");
		
		BufferPacketSender.sendPacket(player, tb.toString(), BufferPacketCategories.DYNAMIC, objectId);
	}
	
	// Shows the available buffs to add to a profile;
	public static void showBuffsToDelete(L2PcInstance player, String profile, String bypass, int objectId)
	{
		List<Integer> ownedBuffs = PlayerMethods.getProfileBuffs(profile, player);
		// int i = 0;
		
		if (ownedBuffs == null)
		{
			player.sendMessage("There are no buffs in that profile.");
			return;
		}
		
		StringBuilder tb = new StringBuilder();
		tb.append("<html noscrollbar><title>Npc Buffer</title><body><table cellpadding=1 cellspacing=1 width=290 height=359 background=\"L2UI_CH3.refinewnd_back_Pattern\"><tr><td valign=\"top\" align=\"center\">");
		tb.append("<table width=265>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("<tr><td align=center><font color=7401DF name=\"hs12\">Chose buffs to deleted!</font><br></td></tr>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("</table>");
		tb.append("<table width=265>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("<tr><td align=center><font color=FFFF00 name=\"hs9\">Scheme Buff: Remove</font><br></td></tr>");
		tb.append("<tr><td height=15></td></tr>");
		tb.append("</table>");
		tb.append("<table width=260 cellpadding=1 cellspacing=1>>");
		for (BuffsInstance buffInst : BuffsHolder.getInstance().getBuffs().values())
		{
			int id = buffInst.getId();
			// Integer level = buffInst.getLevel();
			// String description = buffInst.getDescription();
			String name = buffInst.getName();
			
			// Check if the buff id exists in the owned buffs list
			// Remember the l2pc has only the buffId contained
			if (!ownedBuffs.contains(id))
			{
				continue;
			}
			
			// Temporary fix for long html
			tb.append("<tr>");
			tb.append("<td align=center><a action=\"bypass -h npc_%objectId%_" + bypass + "_" + profile + "_" + id + "\">" + name + "</a></td>");
			tb.append("</tr>");
		}
		
		// Temporary fix for long html
		tb.append("</table>");
		tb.append("<table width=290 cellpadding=1 cellspacing=1>");
		tb.append("<tr><td height=25></td></tr>");
		tb.append("<tr><td align=center><button action=\"bypass -h npc_%objectId%_Chat_main.htm\" width=50 height=30 back=\"L2UI_ct1.Inventory_DF_Btn_RotateRight_Down\" fore=\"L2UI_ct1.Inventory_DF_Btn_RotateRight\"></td></tr>");
		tb.append("</table>");
		tb.append("</td></tr></table></body></html>");
		
		BufferPacketSender.sendPacket(player, tb.toString(), BufferPacketCategories.DYNAMIC, objectId);
	}
}