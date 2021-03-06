/*****************************************************************************
 *
 *  XVID MPEG-4 VIDEO CODEC
 *  - emms C wrapper -
 *
 *  Copyright(C) 2002 Michael Militzer <isibaar@xvid.org>
 *
 *  This program is free software ; you can redistribute it and/or modify
 *  it under the terms of the Affero GNU General Public License as published by
 *  the Free Software Foundation ; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY ; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  Affero GNU General Public License for more details.
 *
 *  You should have received a copy of the Affero GNU General Public License
 *  along with this program ; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307 USA
 *
 * $Id: emms.c 20206 2010-04-08 10:55:00Z gabriel $
 *
 ****************************************************************************/

#include "emms.h"
#include "../portab.h"

/*****************************************************************************
 * Library data, declared here
 ****************************************************************************/

emmsFuncPtr emms;


/*****************************************************************************
 * emms functions
 *
 * emms functions are used to restored the fpu context after mmx operations
 * because mmx and fpu share their registers/context (??? need to be confirmed)
 *
 ****************************************************************************/

/* The no op wrapper for non MMX platforms */
void
emms_c()
{
}
