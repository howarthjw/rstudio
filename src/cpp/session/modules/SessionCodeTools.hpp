/*
 * SessionCodeTools.hpp
 *
 * Copyright (C) 2014 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

#ifndef SESSION_CODE_TOOLS_HPP
#define SESSION_CODE_TOOLS_HPP

namespace core {
class Error;
}

namespace session {
namespace modules {
namespace code_tools {

core::Error initialize();

} // namespace code_tools
} // namespace modules
} // namespace session

#endif