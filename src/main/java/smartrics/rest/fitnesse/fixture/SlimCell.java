/*  Copyright 2011 Fabrizio Cannizzo
 *
 *  This file is part of RestFixture.
 *
 *  RestFixture (http://code.google.com/p/rest-fixture/) is free software:
 *  you can redistribute it and/or modify it under the terms of the
 *  GNU Lesser General Public License as published by the Free Software Foundation,
 *  either version 3 of the License, or (at your option) any later version.
 *
 *  RestFixture is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with RestFixture.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  If you want to contact the author please leave a comment here
 *  http://smartrics.blogspot.com/2008/08/get-fitnesse-with-some-rest.html
 */
package smartrics.rest.fitnesse.fixture;

public class SlimCell implements CellWrapper<String> {

    private String original;
    private String cell;

	public SlimCell(String c) {
        this.original = c;
        this.cell = c;
	}

	@Override
	public String text() {
        return cell;
	}

	@Override
	public void body(String string) {
        cell = string;
	}

	@Override
	public String body() {
        return cell;
	}

	@Override
	public void addToBody(String string) {
        cell = cell + string;
	}

	@Override
    public String getWrapped() {
		return cell;
	}

    public String getOriginal() {
        return original;
    }

    @Override
    public String toString() {
        return "SlimCell[\n  original:'" + original + "',\n      cell:'" + cell + "'\n]";
    }
}