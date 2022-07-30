/////////////////////////////////////////////////////////////////
// GOTHIC (c) 2000 Piranha Bytes GmbH
//
// PATHS.D
//
// Definition of directories, where gothic could find all
// necessary files. The location of this file is the
// directory where the Executable can be found.
//
/////////////////////////////////////////////////////////////////


// the root-directory 
// describes relatively to the home-directory of this file
// where the root of the gothis-directory-structure is
//

CONST STRING DIR_ROOT				= "..";


// The following directories can now be declared reletivly 
// to the root-path of gothic:

// Systemdateien: EXEs sowie DLLs und alles was im gleichen Verz. wie das EXE liegen muß
CONST STRING DIR_SYSTEM				= "\system\";

// SAVEGAMES
CONST STRING DIR_SAVEGAMES			= "\saves\";

// Informationen im HTML-Format und Links
CONST STRING DIR_WEB				= "\web\";

// The data-directory contains all gothic-data
CONST STRING DIR_DATA				= "\_work\data\";

//
// The following path descrive various sub-directories
// of the data-directory. The Macro $DATA$ stand for the
// data-path set above.
//

CONST STRING DIR_ANIMS			= "$DATA$\anims\";
CONST STRING DIR_MESHES			= "$DATA$\meshes\";
CONST STRING DIR_SCRIPTS		= "$DATA$\scripts\";
CONST STRING DIR_TEX			= "$DATA$\textures\";
CONST STRING DIR_CUTSCENES		= "$DATA$\cutscenes\";
CONST STRING DIR_SOUND			= "$DATA$\sound\";
CONST STRING DIR_MUSIC			= "$DATA$\music\";	
CONST STRING DIR_VIDEO			= "$DATA$\video\";	
CONST STRING DIR_WORLD			= "$DATA$\worlds\";
CONST STRING DIR_FONTS			= "$DATA$\fonts\";
const string DIR_OUTPUTUNITS	= "$DATA$\scripts\content\cutscene\";			

CONST STRING DIR_COMPILED_ANIMS		= "$DATA$\anims\_compiled\";
CONST STRING DIR_COMPILED_MESHES	= "$DATA$\meshes\_compiled\";
CONST STRING DIR_COMPILED_SCRIPTS	= "$DATA$\scripts\_compiled\";
CONST STRING DIR_COMPILED_TEXTURES	= "$DATA$\textures\_compiled\";

// ToDo Ulf: Desktop-GFX auch als Compiled-Format benutzen?
// Dann ist diese Angabe wahrscheinlich auch nicht mehr nötig
CONST STRING DIR_TEX_DESKTOP		= "$DATA$\textures\desktop\";

// other paths during work-cycle
CONST STRING DIR_PRESETS		= "\$DATA$\presets\";
CONST STRING DIR_TOOLS_CONFIG		= "\_work\tools\";
CONST STRING DIR_TOOLS_DATA		= "\_work\tools\data\";

// Sub-directories. 
// The follwing paths describe sub-directories. It's used in various directories.
CONST STRING SUBDIR_INTERN			= "_intern\";

	
