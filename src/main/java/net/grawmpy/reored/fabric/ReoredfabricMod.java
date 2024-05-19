/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.grawmpy.reored.fabric;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.grawmpy.reored.fabric.init.ReoredfabricModTabs;
import net.grawmpy.reored.fabric.init.ReoredfabricModItems;
import net.grawmpy.reored.fabric.init.ReoredfabricModFeatures;
import net.grawmpy.reored.fabric.init.ReoredfabricModBlocks;

import net.fabricmc.api.ModInitializer;

public class ReoredfabricMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "reoredfabric";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing ReoredfabricMod");

		ReoredfabricModTabs.load();

		ReoredfabricModBlocks.load();
		ReoredfabricModItems.load();

		ReoredfabricModFeatures.load();

	}
}
